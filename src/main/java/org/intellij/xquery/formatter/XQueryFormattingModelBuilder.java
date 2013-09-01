/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.xquery.formatter;

import com.intellij.formatting.FormattingModel;
import com.intellij.formatting.FormattingModelBuilder;
import com.intellij.formatting.FormattingModelProvider;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.tree.TokenSet;
import org.intellij.xquery.XQueryLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.intellij.formatting.FormattingModelProvider.createFormattingModelForPsiFile;
import static org.intellij.xquery.psi.XQueryTypes.*;

/**
 * User: ligasgr
 * Date: 21/08/13
 * Time: 19:49
 */
public class XQueryFormattingModelBuilder implements FormattingModelBuilder {

    private static final TokenSet KEYWORDS = TokenSet.create(K_NAMESPACE, K_DEFAULT, K_IMPORT, K_DECLARE, K_SCHEMA, K_AT, K_COLLATION, K_ELEMENT, K_FUNCTION, K_TEXT, K_COMMENT, K_NODE, K_PI, K_IF, K_THEN, K_ELSE, K_TYPESWITCH, K_SWITCH, K_VALIDATE, K_CONTEXT, K_MODULE, K_INHERIT, K_NO_INHERIT, K_PRESERVE, K_NO_PRESERVE, K_BASE_URI, K_XQUERY, K_VERSION, K_ENCODING, K_OPTION, K_STRIP, K_SOME, K_IN, K_AS, K_LET, K_RETURN, K_AND, K_OR, K_CASE, K_FOR, K_VARIABLE, K_COPY_NAMESPACES, K_CONSTRUCTION, K_ORDER, K_EVERY, K_BOUNDARY_SPACE, K_ORDERING, K_ORDERED, K_UNORDERED, K_EMPTY, K_GREATEST, K_LEAST, K_DECIMAL_FORMAT, K_DECIMAL_SEPARATOR, K_GROUPING_SEPARATOR, K_INFINITY, K_MINUS_SIGN, K_NAN, K_PERCENT, K_PER_MILLE, K_ZERO_DIGIT, K_DIGIT, K_PATTERN_SEPARATOR, K_ITEM, K_TO, K_WHERE, K_GROUP, K_BY, K_ALLOWING, K_ASCENDING, K_DESCENDING, K_INSTANCE, K_OF, K_SATISFIES, K_MAP, K_ATTRIBUTE, K_DOCUMENT_NODE, K_EMPTY_SEQUENCE, K_NAMESPACE_NODE, K_SCHEMA_ATTRIBUTE, K_SCHEMA_ELEMENT, K_DOCUMENT, K_STABLE, K_CHILD, K_DESCENDANT, K_SELF, K_DESCENDANT_OR_SELF, K_FOLLOWING_SIBLING, K_FOLLOWING, K_PARENT, K_ANCESTOR, K_PRECEDING_SIBLING, K_PRECEDING, K_ANCESTOR_OR_SELF, K_TUMBLING, K_SLIDING, K_WINDOW, K_START, K_WHEN, K_ONLY, K_END, K_PREVIOUS, K_NEXT, K_COUNT, K_TRY, K_CATCH, K_DIV, K_IDIV, K_MOD, K_UNION, K_INTERSECT, K_EXCEPT, K_TREAT, K_CASTABLE, K_CAST, K_IS, K_TYPE, K_LAX, K_STRICT, K_EXTERNAL);

    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        CommonCodeStyleSettings commonSettings = settings.getCommonSettings(XQueryLanguage.INSTANCE);
        final XQueryFormattingBlock block = new XQueryFormattingBlock(element.getNode(), null, null, commonSettings,
                createSpacingBuilder(settings));
        FormattingModel result = createFormattingModelForPsiFile(element.getContainingFile(), block, settings);
        return result;
    }

    private static SpacingBuilder createSpacingBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings)
                .around(EQUAL).spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .around(OP_ASSIGN).spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .before(COMA).spaceIf(settings.SPACE_BEFORE_COMMA)
                .after(COMA).spaceIf(settings.SPACE_AFTER_COMMA)
                .around(KEYWORDS).spaces(1)
                .after(L_BRACKET).none()
                .before(R_BRACKET).none()
                .after(L_C_BRACE).none()
                .before(R_C_BRACE).none()
                .before(ARGUMENT_LIST).none()
                .before(ARGUMENT).none()
                .after(ARGUMENT).none()
                .before(PARAM_LIST).none()
                .before(PARAM).none()
                .after(PARAM).none()
                ;
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}