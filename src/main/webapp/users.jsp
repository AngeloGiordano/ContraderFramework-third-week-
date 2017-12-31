<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="headerAdmin.jsp" />

<img id ="underNav" src="/gommastore/css/img/listut.jpg">

<div class="page-body">
    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Username</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="users">
                <tr>
                    <td>${users.username}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>

<jsp:include page="footer.jsp" />

