<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="headerUser.jsp" />

<img id ="underNav" src="/gommastore/css/img/menuu.jpg">

<c:if test="${msg!=null}">
    <div id="msg" class="alert alert-success alert-dismissable">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
            ${msg}
    </div>
</c:if>
<div class="container">
<c:url var="url3" value="/gomme/allgomme" />
<form action="${url3}">
    <button type="submit" class="btn btn-default btn-block">Visualizza pneumatici <img class="iconmenu" src="/gommastore/css/img/pneumatic.png"></button>
</form>
<br>
</div>

    <script src="/gommastore/css/subMenu.js"></script>
<jsp:include page="footer.jsp" />