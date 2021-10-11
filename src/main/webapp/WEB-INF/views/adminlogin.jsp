<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="en" >
<head>
  <title>RentIt Login</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
  
  <style type="text/css"> 
  
  body
  {
  	background-image:url(https://images.unsplash.com/photo-1585503418537-88331351ad99?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1567&q=80);
  	height="100%"
  }
  	.form-2 {
    
    width: 340px;
    margin: 60px auto 30px;
    padding: 15px;
    position: relative;

    /* Styles */
    background: #fffaf6;
    border-radius: 4px;
    color: #7e7975;
    box-shadow:
        0 2px 2px rgba(0,0,0,0.2),        
        0 1px 5px rgba(0,0,0,0.2),        
        0 0 0 12px rgba(255,255,255,0.4); 
	}
	
	
	
.form-2 .float {
    width: 50%;
    float: left;
    padding-top: 15px;
    border-top: 1px solid rgba(255,255,255,1);
}

.form-2 .float:first-of-type {
    padding-right: 5px;
}

.form-2 .float:last-of-type {
    padding-left: 5px;
}

.form-2 label {
    display:Block;
    padding: 0 0 5px 2px;
    cursor: pointer;
    text-transform: uppercase;
    font-weight: 400;
    text-shadow: 0 1px 0 rgba(255,255,255,0.8);
    font-size: 14px;
}

.form-2 label i {
    margin-right: 10px; /* Gap between icon and text */
    display: inline-block;
    width: 10px;
}

.form-2 input[type=text],
.form-2 input[type=password] {
    font-family: 'Lato', Calibri, Arial, sans-serif;
    font-size: 13px;
    font-weight: 400;
    display: block;
    width: 100%;
    padding: 5px;
    margin-bottom: 5px;
    border: 3px solid #ebe6e2;
    border-radius: 5px;
    transition: all 0.3s ease-out;
}

.form-2 input[type=text]:hover,
.form-2 input[type=password]:hover {
    border-color: #CCC;
}

.form-2 label:hover ~ input {
    border-color: #CCC;
}

.form-2 input[type=text]:focus,
.form-2 input[type=password]:focus {
    border-color: #BBB;
    }
    
    
    .clearfix:after {
	content: "";
	display: table;
	clear: both;
}

.form-2 input[type=submit],
{
    /* Size and position */
    width: 49%;
    height: 38px;
    float: left;
    position: relative;

    /* Styles */
    box-shadow: inset 0 1px rgba(255,255,255,0.3);
    border-radius: 3px;
    cursor: pointer;

    /* Font styles */
    font-family: 'Lato', Calibri, Arial, sans-serif;
    font-size: 14px;
    line-height: 38px; /* Same as height */
    text-align: center;
    font-weight: bold;
}

.form-2 input[type=submit] {
    margin-left: 1%;
    align:center;
    background: linear-gradient(#fbd568, #ffb347);
    border: 1px solid #f4ab4c;
    color: #996319;
    text-shadow: 0 1px rgba(255,255,255,0.3);
}


	
	.form-2 input[type=submit]:hover,
 {
    box-shadow: 
        inset 0 1px rgba(255,255,255,0.3), 
        inset 0 20px 40px rgba(255,255,255,0.15);
}

.form-2 input[type=submit]:
{
    top: 1px;
}
  </style>
  

  
  
  
</head>


<body >

		
	
<!--	<div style="margin-top: 10%; background-color: #cc9200">	-->
	
	<div style="margin-top: 12%;" >	
	<div class="container">
	

	
	  
	  
	  <form  class="form-2" action="adminlogin" method="post">
	  
	  <h2><span class="log-in">Log in</span></h2>
	  
	  <div class="form-group" >
	      <div class="col-sm-offset-2 col-sm-10">
			 <c:if test="${param.error != null}">
			    <div id="error">
			       <p style="background-color: white; width: 50%;"> <font color="red">
			       			<b>ERROR! Invalid Credentials<br>Try Again... </b></font> </p>
			    </div>
			</c:if>
			</div>
		</div>
	 
	    <p class="float">
	      <label for="login"><i class="icon-user" class="form-control"></i>Username</label>
        	<input type="text" name="username" placeholder="Username or email">
        </p>
	     
	   
	    <p class="float">
        	<label for="password"><i class="icon-lock"></i>Password</label>
        	<input type="password" name="password" placeholder="Password" > 
    	</p>
    	
    	<p class="clearfix"> 
            
       		 <input type="submit" name="submit" class="btn btn-success" value="SUBMIT">
    	</p> 
	 
	    
	  </form>
	  
	  

	</div>
	</div>
	

</body>
</html>
