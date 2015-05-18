<%--
 * 
 * @author Shengzhao Li
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html ng-app>
<head>
    <meta charset="utf-8"/>
    <c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application"/>

    <meta name="viewport" content="width=device-width,user-scalable=no"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>

    <title><decorator:title default=""/> -  Spring Security&Oauth2 Client</title>

    <script src="http://cdn.bootcss.com/angular.js/1.1.5/angular.min.js"></script>

    <decorator:head/>

</head>
<body>
<div>
    <decorator:body/>
</div>
<div>
    <hr/>
    <p>
        <a href="mailto:monkeyk1987@gmail.com">monkeyk1987@gmail.com</a>, from <a href="http://git.oschina.net/mkk/spring-oauth-client" target="_blank">spring-oauth-client</a>
    </p>
</div>
</body>
</html>