<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="headerReg.jsp" />
<body>
<img id ="underNav" src="/gommastore/css/img/registrazionenuvoutente.jpg">

<div class="page-body">
    <c:url var="url" value="/login/regControl" />
    <c:if test="${msg!=null}">
        <div id="msg" class="alert alert-success alert-dismissable">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            ${msg}
        </div>
    </c:if>


    <form action="${url}" method="post" ModelAttribute="User">
        <fieldset>
        <div class="container" style=" width: 400px" >


            <div class="row">
                <div class=" col-xs-6 col-sm-8 col-md-10 col-lg-12">
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" name="username" id="username" placeholder="Inserisci un username..."required>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-6 col-sm-8 col-md-10 col-lg-12">
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="text" class="form-control" name="password" id="password" placeholder="Inserisci una password..."required>
                    </div>
                </div>
            </div>

            <button type="submit" class="btn btn-default">Invia</button>



        </div>
        </fieldset>
    </form>



</div>
</div>
</body>

<jsp:include page="footer.jsp" />