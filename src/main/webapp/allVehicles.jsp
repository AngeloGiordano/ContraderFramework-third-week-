<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="headerAdmin.jsp" />

<img id ="underNav" src="/gommastore/css/img/listavei.jpg">

<div class="page-body">

    <div class="container">

        <table class="table table-striped" >
            <thead>
                <tr>
                    <th>Produttore</th>
                    <th>Modello</th>
                    <th>Alimentazione</th>
                </tr>
            </thead>
            <c:forEach items="${allVehicles}" var="allVehicle">
            <tbody>
                <tr>
                    <td>${allVehicle.brand}</td>
                    <td>${allVehicle.model}</td>
                    <td>${allVehicle.fuel}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>



</div>

<jsp:include page="footer.jsp" />
