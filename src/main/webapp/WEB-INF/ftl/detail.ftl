<html>
<head><title>FreeMarker Spring MVC Hello World</title>
<body>
	<div id="header">
	<H2>
	    FreeMarker Spring MVC Hello World
	</H2>
	</div>
	<ul>
		<li>employeeName:${employeeName?upper_case}</li>
 		<li>age:${age}</li>
 		<li>enable:${enable?string("enable","disable")}</li>
 		<li>address:${address}</li>
 		<li>tel:${tel}</li>				

 	</ul>
</html>
	