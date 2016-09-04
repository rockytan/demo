<#include "layouts/default.ftl" />
<@head>
<link rel="stylesheet" href="/webjars/ace/assets/css/ace.min.css" />
</@head>
<@body>
<h1>${message}</h1>
    <#list clist() as item>
    ${item}
    </#list>
</@body>