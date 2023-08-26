<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    

<!DOCTYPE html>
<html lang="en">

<!-- Incluindo a pagina head, onde tem todos os intens da TAg HEAD -->
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="theme-loader.jsp"></jsp:include>

  
 
 <body>
 
  <!-- Pre-loader end -->
  <div id="pcoded" class="pcoded">
      <div class="pcoded-overlay-box"></div>
      <div class="pcoded-container navbar-wrapper">
<!-- CARREGANDO O NAVBAR -->
<jsp:include page="navbar.jsp"></jsp:include>

          <div class="pcoded-main-container">
              <div class="pcoded-wrapper">
              
<jsp:include page="navbarmainmenu.jsp"></jsp:include>
                  
                  <div class="pcoded-content">
                  
                      <!-- CARREGAMENTO DA PAGINA Page-header  -->
                      <jsp:include page="page-header.jsp"></jsp:include>
                      
                      <!-- Page-header end -->
                        <div class="pcoded-inner-content">
                            <!-- Main-body start -->
                            <div class="main-body">
                                <div class="page-wrapper">
                                    <!-- Page-body start -->
                                    <div class="page-body">
                                        <div class="row">
                                        
                                       <!-- AQUI VAI SER CRIADO TODO O CONTEUDO NOVO -->
                                       
                                        </div>
                                    </div>
                                    <!-- Page-body end -->
                                </div>
                                <div id="styleSelector"> </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
 <!-- Carregamento da pagina com os SCRIPS DO JAVASCRIPT -->
 <jsp:include page="javascriptfile.jsp"></jsp:include>   
   
</body>

</html>
