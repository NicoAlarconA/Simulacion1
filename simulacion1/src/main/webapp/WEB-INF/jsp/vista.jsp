<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado ayuda</title>

</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-10 offset-md-1">
    <p></p>
    <h1>SECURITY LIFE</h1>
       <div class="panel panel-default panel-table">
          <div class="panel-heading">
            <div class="row">
              <div class="col-8">
                <h3 class="panel-title">Listado de Ayuda</h3>
                 </div>
                  <div class="col-4 text-right">
                    <a role="button" aria-pressed="true" title="Editar usuario" href="cliform" class="btn btn-sm btn-success btn-create">Agregar usuario</a>
                  </div>
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
                        <th>Ciudad</th>
						<th>Tipo de ayuda</th>
						<th>Monto</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${layuda}" var="lista">
                          <tr>
                            <td class="align-middle">${lista.ciudad}</td>
							<td class="align-middle">${lista.tipo}</td>
							<td class="align-middle">${lista.rubroCli}</td>
							<td class="align-middle">${lista.direccionCli}</td>
					        </tr>
                    </c:forEach>
                   </tbody>
                </table>
                <div class="col-4 text-left">
   				<a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   				</div>
              </div>
        </div>
 	 </div>
  </div>
  </div>



</body>
</html>