/*
 * Copyright 2013-2015 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
 * (see the CONTRIBUTORS file).
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

package org.intellij.xquery.completion.function.bif;

import org.intellij.xquery.completion.function.AbstractBuiltInFunctionTable;
import org.intellij.xquery.reference.namespace.PredeclaredNamespaces;
import org.intellij.xquery.reference.namespace.saxon.SaxonPredeclaredNamespaces;

public class SaxonBuiltInFunctionTable extends AbstractBuiltInFunctionTable {


    private PredeclaredNamespaces predeclaredNamespaces = new SaxonPredeclaredNamespaces();

    {
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append", 2, "file as xs:string, items as item()*", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append", 3, "file as xs:string, items as item()*, params as element(output:serialization-parameters)", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append-binary", 2, "file as xs:string, value as xs:base64Binary", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append-text", 2, "file as xs:string, value as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append-text", 3, "file as xs:string, value as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append-text-lines", 2, "file as xs:string, values as xs:string*", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "append-text-lines", 3, "file as xs:string, values as xs:string*, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "base-name", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "base-name", 2, "file as xs:string, suffix as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "copy", 2, "source as xs:string, target as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "create-dir", 1, "dir as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "delete-dir", 1, "path as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "delete-dir", 2, "path as xs:string, recursive as xs:boolean", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "dir-separator", 0, "", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "exists", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "is-dir", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "is-file", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "last-modified", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "line-separator", 0, "", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "list", 1, "dir as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "list", 2, "dir as xs:string, recursive as xs:boolean", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "list", 3, "dir as xs:string, recursive as xs:boolean, pattern as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "move", 2, "source as xs:string, target as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "path-separator", 0, "", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "path-to-native", 1, "path as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "path-to-uri", 1, "path as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "read-binary", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "read-text", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "read-text", 2, "file as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "read-text-lines", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "read-text-lines", 2, "file as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "resolve-path", 1, "path as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "size", 1, "file as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write", 2, "file as xs:string, items as item()*", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write", 3, "file as xs:string, items as item()*, params as element(output:serialization-parameters)", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write-binary", 2, "file as xs:string, value as xs:base64Binary", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write-text", 2, "file as xs:string, value as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write-text", 3, "file as xs:string, value as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write-text-lines", 2, "file as xs:string, values as xs:string*", ""));
        fnMap.putValue(ns("expath-file"), bif("expath-file", "write-text-lines", 3, "file as xs:string, values as xs:string*, encoding as xs:string", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "binary-entry", 2, "href as xs:anyURI, entry as xs:string", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "entries", 1, "href as xs:anyURI", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "html-entry", 2, "href as xs:anyURI, entry as xs:string", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "text-entry", 2, "href as xs:anyURI, entry as xs:string", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "update-entries", 2, "zip as element(zip:file), output as xs:anyURI", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "xml-entry", 2, "href as xs:anyURI, entry as xs:string", ""));
        fnMap.putValue(ns("expath-zip"), bif("expath-zip", "zip-file", 1, "zip as element(zip:file)", ""));
        fnMap.putValue(ns("exslt-common"), bif("exslt-common", "node-set", 1, "arg as item()*", ""));
        fnMap.putValue(ns("exslt-common"), bif("exslt-common", "object-type", 1, "arg as item()*", ""));
        fnMap.putValue(ns("exslt-math"), bif("exslt-math", "constant", 2, "name as xs:string, precision as xs:integer", ""));
        fnMap.putValue(ns("exslt-random"), bif("exslt-random", "random-sequence", 2, "count as xs:integer, seed as xs:double", ""));
        fnMap.putValue(ns("fn"), bif("fn", "QName", 2, "paramURI as xs:string?, paramQName as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "abs", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-date-to-timezone", 1, "arg as xs:date?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-date-to-timezone", 2, "arg as xs:date?, timezone as xs:dayTimeDuration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-dateTime-to-timezone", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-dateTime-to-timezone", 2, "arg as xs:dateTime?, timezone as xs:dayTimeDuration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-time-to-timezone", 1, "arg as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "adjust-time-to-timezone", 2, "arg as xs:time?, timezone as xs:dayTimeDuration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "analyze-string", 2, "input as xs:string?, pattern as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "analyze-string", 3, "input as xs:string?, pattern as xs:string, flags as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "available-environment-variables", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "avg", 1, "arg as xs:anyAtomicType*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "base-uri", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "base-uri", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "boolean", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "ceiling", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "codepoint-equal", 2, "comparand1 as xs:string?, comparand2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "codepoints-to-string", 1, "arg as xs:integer*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "collection", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "collection", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "compare", 2, "comparand1 as xs:string?, comparand2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "compare", 3, "comparand1 as xs:string?, comparand2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "concat", 3, "arg1 as xs:anyAtomicType?, arg2 as xs:anyAtomicType?, etc... as xs:anyAtomicType?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "contains", 2, "arg1 as xs:string?, arg2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "contains", 3, "arg1 as xs:string?, arg2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "copy-of", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "copy-of", 1, "source as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "count", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current-date", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current-dateTime", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current-group", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current-grouping-key", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "current-time", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "data", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "data", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "dateTime", 2, "arg1 as xs:date?, arg2 as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "day-from-date", 1, "arg as xs:date?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "day-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "days-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "deep-equal", 2, "parameter1 as item()*, parameter2 as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "deep-equal", 3, "parameter1 as item()*, parameter2 as item()*, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "default-collation", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "distinct-values", 1, "arg as xs:anyAtomicType*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "distinct-values", 2, "arg as xs:anyAtomicType*, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "doc", 1, "uri as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "doc-available", 1, "uri as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "document", 1, "uri as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "document", 2, "uri as item()*, base as node()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "document-uri", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "document-uri", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "element-available", 1, "arg as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "element-with-id", 1, "arg as xs:string*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "element-with-id", 2, "arg as xs:string*, node as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "empty", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "encode-for-uri", 1, "uri-part as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "ends-with", 2, "arg1 as xs:string?, arg2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "ends-with", 3, "arg1 as xs:string?, arg2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "environment-variable", 1, "name as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "error", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "error", 1, "code as xs:QName", ""));
        fnMap.putValue(ns("fn"), bif("fn", "error", 2, "code as xs:QName?, description as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "error", 3, "code as xs:QName?, description as xs:string, error-object as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "escape-html-uri", 1, "uri as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "exactly-one", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "exists", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "false", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "filter", 2, "seq as item()*, f as function(item()) as xs:boolean", ""));
        fnMap.putValue(ns("fn"), bif("fn", "floor", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "fold-left", 3, "seq as item()*, zero as item()*, f as function(item()*, item()) as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "fold-right", 3, "seq as item()*, zero as item()*, f as function(item(), item()*) as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "for-each", 2, "seq as item()*, f as function(item()) as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "for-each-pair", 3, "seq1 as item()*, seq2 as item()*, f as function(item(), item()) as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-date", 2, "value as xs:date?, picture as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-date", 5, "value as xs:date?, picture as xs:string, language as xs:string?, calendar as xs:string?, place as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-dateTime", 2, "value as xs:dateTime?, picture as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-dateTime", 5, "value as xs:dateTime?, picture as xs:string, language as xs:string?, calendar as xs:string?, place as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-integer", 2, "value as xs:integer?, picture as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-integer", 3, "value as xs:integer?, picture as xs:string, language as xs:language", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-number", 2, "value as numeric?, picture as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-number", 3, "value as numeric?, picture as xs:string, decimal-format-name as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-time", 2, "value as xs:time?, picture as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "format-time", 5, "value as xs:time?, picture as xs:string, language as xs:string?, calendar as xs:string?, place as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "function-arity", 1, "func as function(*)", ""));
        fnMap.putValue(ns("fn"), bif("fn", "function-available", 1, "function as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "function-available", 2, "function as xs:string, arity as xs:integer", ""));
        fnMap.putValue(ns("fn"), bif("fn", "function-lookup", 2, "function as xs:string, arity as xs:integer", ""));
        fnMap.putValue(ns("fn"), bif("fn", "function-name", 1, "func as function(*)", ""));
        fnMap.putValue(ns("fn"), bif("fn", "generate-id", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "generate-id", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "has-children", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "has-children", 1, "seq as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "head", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "hours-from-time", 1, "arg as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "id", 1, "arg as xs:string*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "id", 2, "arg as xs:string*, node as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "idref", 1, "arg as xs:string*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "idref", 2, "arg as xs:string*, node as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "implicit-timezone", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "in-scope-prefixes", 1, "element as element()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "index-of", 2, "seq as xs:anyAtomicType*, search as xs:anyAtomicType", ""));
        fnMap.putValue(ns("fn"), bif("fn", "index-of", 3, "seq as xs:anyAtomicType*, search as xs:anyAtomicType, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "innermost", 1, "seq as node()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "insert-before", 3, "target as item()*, position as xs:integer, inserts as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "iri-to-uri", 1, "iri as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "lang", 1, "testlang as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "lang", 2, "testlang as xs:string?, node as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "last", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "local-name", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "local-name", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "local-name-from-QName", 1, "arg as xs:QName?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "lower-case", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "matches", 2, "input as xs:string?, pattern as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "matches", 3, "input as xs:string?, pattern as xs:string, flags as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "max", 1, "arg as xs:anyAtomicType*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "max", 2, "arg as xs:anyAtomicType*, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "min", 1, "arg as xs:anyAtomicType*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "min", 2, "arg as xs:anyAtomicType*, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "minutes-from-time", 1, "arg as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "month-from-date", 1, "arg as xs:date?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "month-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "months-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "name", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "name", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri-for-prefix", 2, "prefix as xs:string?, element as element()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "namespace-uri-from-QName", 1, "arg as xs:QName?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "nilled", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "node-name", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "node-name", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-space", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-space", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-unicode", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "normalize-unicode", 2, "arg as xs:string?, normalizationForm as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "not", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "number", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "number", 1, "arg as xs:anyAtomicType?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "one-or-more", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "outermost", 1, "seq as node()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "parse-json", 1, "arg as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "parse-json", 2, "arg as xs:string, options as map(*)", ""));
        fnMap.putValue(ns("fn"), bif("fn", "parse-xml", 1, "arg as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "parse-xml", 2, "arg as xs:string, baseURI as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "path", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "path", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "position", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "prefix-from-QName", 1, "arg as xs:QName?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "put", 2, "doc as node(), uri as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "regex-group", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "remove", 2, "target as item()*, position as xs:integer", ""));
        fnMap.putValue(ns("fn"), bif("fn", "replace", 3, "input as xs:string?, pattern as xs:string, replacement as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "replace", 4, "input as xs:string?, pattern as xs:string, replacement as xs:string, flags as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-QName", 2, "qname as xs:string?, element as element()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-uri", 1, "relative as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "resolve-uri", 2, "relative as xs:string?, base as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "reverse", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "root", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "root", 1, "arg as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "round", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "round", 2, "arg as numeric?, precision as xs:integer", ""));
        fnMap.putValue(ns("fn"), bif("fn", "round-half-to-even", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "round-half-to-even", 2, "arg as numeric?, precision as xs:integer", ""));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "seconds-from-time", 1, "arg as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "serialize", 1, "arg as node()", ""));
        fnMap.putValue(ns("fn"), bif("fn", "serialize", 2, "arg as node(), params as node()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "serialize-json", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "serialize-json", 2, "arg as item()*, options as map(*)", ""));
        fnMap.putValue(ns("fn"), bif("fn", "snapshot", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "snapshot", 1, "source as node()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "starts-with", 2, "arg1 as xs:string?, arg2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "starts-with", 3, "arg1 as xs:string?, arg2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "static-base-uri", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string", 1, "arg as item()?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string-join", 1, "arg1 as xs:string*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string-join", 2, "arg1 as xs:string*, arg2 as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string-length", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string-length", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "string-to-codepoints", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "subsequence", 2, "sourceSeq as item()*, startingLoc as xs:double", ""));
        fnMap.putValue(ns("fn"), bif("fn", "subsequence", 3, "sourceSeq as item()*, startingLoc as xs:double, length as xs:double", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring", 2, "sourceString as xs:string?, start as xs:double", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring", 3, "sourceString as xs:string?, start as xs:double, length as xs:double", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring-after", 2, "arg1 as xs:string?, arg2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring-after", 3, "arg1 as xs:string?, arg2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring-before", 2, "arg1 as xs:string?, arg2 as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "substring-before", 3, "arg1 as xs:string?, arg2 as xs:string?, collation as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "sum", 1, "arg as xs:anyAtomicType*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "sum", 2, "arg as xs:anyAtomicType*, zero as xs:anyAtomicType?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "system-property", 1, "arg as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "tail", 1, "arg as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-date", 1, "arg as xs:date?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "timezone-from-time", 1, "arg as xs:time?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "tokenize", 2, "input as xs:string?, pattern as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "tokenize", 3, "input as xs:string?, pattern as xs:string, flags as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "trace", 2, "value as item()*, label as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "translate", 3, "arg as xs:string?, mapString as xs:string, transString as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "true", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "type-available", 1, "type as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unordered", 1, "sourceSeq as item()*", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-entity-public-id", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-entity-uri", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text", 1, "href as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text", 2, "href as xs:string?, encoding as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-available", 1, "href as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-available", 2, "href as xs:string?, encoding as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-lines", 1, "href as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "unparsed-text-lines", 2, "href as xs:string?, encoding as xs:string", ""));
        fnMap.putValue(ns("fn"), bif("fn", "upper-case", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "uri-collection", 0, "", ""));
        fnMap.putValue(ns("fn"), bif("fn", "uri-collection", 1, "arg as xs:string?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "year-from-date", 1, "arg as xs:date?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "year-from-dateTime", 1, "arg as xs:dateTime?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "years-from-duration", 1, "arg as xs:duration?", ""));
        fnMap.putValue(ns("fn"), bif("fn", "zero-or-one", 1, "arg as item()*", ""));
        fnMap.putValue(ns("map"), bif("map", "contains", 2, "map as map(*), key as xs:anyAtomicType", ""));
        fnMap.putValue(ns("map"), bif("map", "entry", 2, "key as xs:anyAtomicType, value as item()*", ""));
        fnMap.putValue(ns("map"), bif("map", "get", 2, "map as map(*), key as xs:anyAtomicType", ""));
        fnMap.putValue(ns("map"), bif("map", "keys", 1, "map as map(*)", ""));
        fnMap.putValue(ns("map"), bif("map", "new", 0, "", ""));
        fnMap.putValue(ns("map"), bif("map", "new", 1, "maps as map(*)*", ""));
        fnMap.putValue(ns("map"), bif("map", "remove", 2, "map as map(*), key as xs:anyAtomicType", ""));
        fnMap.putValue(ns("map"), bif("map", "validate", 1, "node as node()?", ""));
        fnMap.putValue(ns("math"), bif("math", "acos", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "asin", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "atan", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "atan2", 2, "y as xs:double?, x as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "cos", 1, "θ as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "exp", 1, "arg as xs:double", ""));
        fnMap.putValue(ns("math"), bif("math", "exp10", 1, "arg as xs:double", ""));
        fnMap.putValue(ns("math"), bif("math", "log", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "log10", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "pi", 0, "", ""));
        fnMap.putValue(ns("math"), bif("math", "pow", 2, "arg1 as xs:double?, arg2 as numeric", ""));
        fnMap.putValue(ns("math"), bif("math", "sin", 1, "θ as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "sqrt", 1, "arg as xs:double?", ""));
        fnMap.putValue(ns("math"), bif("math", "tan", 1, "θ as xs:double?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "adjust-to-civil-time", 2, "name as xs:string, precision as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "analyze-string", 4, "select as xs:string, regex as xs:string, matching as function(*), nonMatching as function(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "analyze-string", 5, "select as xs:string, regex as xs:string, matching as function(*), nonMatching as function(*), flags as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "base64Binary-to-octets", 1, "input as xs:base64Binary", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "base64Binary-to-string", 2, "input as xs:base64Binary, encoding as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "column-number", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "column-number", 1, "node as node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "compile-query", 1, "query as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "compile-stylesheet", 2, "stylesheet as document-node(), precision as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "current-mode-name", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "decimal-divide", 3, "arg1 as xs:decimal, arg2 as xs:decimal, precision as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "deep-equal", 3, "arg1 as item()*, arg2 as item()*, flags as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "discard-document", 1, "doc as document-node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "eval", 4, "stored-expression as jt:net.sf.saxon.functions.Evaluate-PreparedExpression, param1 as item()*, param2 as item()*, param3 as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "evaluate", 4, "xpath as xs:string, param1 as item()*, param2 as item()*, param3 as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "evaluate-node", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "evaluate-node", 1, "node as node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "expression", 1, "string as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "expression", 2, "string as xs:string, ns as element()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "find", 2, "map as map(*), key as xs:anyAtomicType", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "get-pseudo-attribute", 1, "att as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "has-same-nodes", 2, "arg1 as node()*, arg2 as node()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "hexBinary-to-octets", 1, "input as xs:hexBinary", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "hexBinary-to-string", 2, "input as xs:hexBinary, encoding as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "highest", 1, "input as item(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "highest", 2, "input as item(*), key as function(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "in-summer-time", 2, "date as xs:dateTime, region as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "index", 2, "sequence as item(), function as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "is-whole-number", 1, "arg as numeric?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "key-map", 4, "key as xs:string, doc as node(), min as xs:string?, max as xs:string?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "last-modified", 1, "uri as xs:string?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "leading", 1, "input as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "leading", 2, "input as item()*, test as function(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "line-number", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "line-number", 1, "node as node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "lowest", 1, "input as item(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "lowest", 2, "input as item(*), key as function(*)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "namespace-node", 2, "prefix as xs:string, uri as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "octets-to-base64Binary", 1, "octents as xs:integer*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "octets-to-hexBinary", 1, "octents as xs:integer*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "parse", 1, "xml as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "parse-html", 1, "html as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "path", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "path", 1, "node as node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "print-stack", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "query", 1, "name as jt:net.sf.saxon.query.XQueryExpression?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "query", 2, "name as jt:net.sf.saxon.query.XQueryExpression?, context-item as item()?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "query", 3, "name as jt:net.sf.saxon.query.XQueryExpression?, context-item as item()?, params as node()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "schema", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "schema", 2, "kind as xs:string, name as xs:QName", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "send-mail", 4, "emailConfig as map(*), subject as xs:string, content as item(), attachment as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "serialize", 2, "node as node(), format as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "serialize", 2, "node as node(), format as element(xsl:output)", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "sort", 1, "seq as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "sort", 2, "seq as item()*, sort-key as function(item()) as xs:anyAtomicType", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "stream", 1, "input as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "string-to-base64Binary", 2, "in as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "string-to-hexBinary", 2, "in as xs:string, encoding as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "string-to-utf8", 1, "name as xs:string", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "system-id", 0, "", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "transform", 2, "stylesheet as jt:javax.xml.transform.Templates, source as node()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "transform", 3, "stylesheet as jt:javax.xml.transform.Templates, source as node(), params as item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "type", 1, "item as item()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "type-annotation", 1, "item as item()", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "unparsed-entities", 2, "doc as document-node(), precision as xs:integer", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "validate", 1, "node as node()?", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "validate", 2, "node as node()?, options as map(xs:string, item()*", ""));
        fnMap.putValue(ns("saxon"), bif("saxon", "validate", 3, "node as node()?, options as map(xs:string, item()*, params as map(xs:string, item()*", ""));
    }

    public PredeclaredNamespaces predeclaredNamespaces() {
        return predeclaredNamespaces;
    }
}
