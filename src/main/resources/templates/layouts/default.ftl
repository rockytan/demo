<#macro head>
	<#assign layout_head>
		<#nested />
	</#assign>
</#macro>

<#macro body>
	<!DOCTYPE html>
	<html lang="en">
	<head>
		${layout_head}
	</head>
	<body>
	上面的公共内容<br>
	<#nested /><br>
	下面的公共内容
		<#list clist() as item>
		${item}
		</#list>
	</body>
	</html>
</#macro>
