
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="en" >
<head>
  <title>Access Denied</title>
  
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
    
    float: left;
    padding-top: 15px;
    border-top: 1px solid rgba(255,255,255,1);
}

.form-2 .float:first-of-type {
    padding-right: 0px;
}

.form-2 .float:last-of-type {
    padding-left:0px;
}

.form-2 label {
    display:Block;
    cursor: pointer;
    font-weight: 400;
    text-shadow: 0 1px 0 rgba(255,255,255,0.8);
    font-size: 14px;
}
    
    
    .clearfix:after {
	content: "";
	
	clear: both;
}

.form-2 a[type=submit],
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

.form-2 a[type=submit] {
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
	

	
	  
	  
	  <div  class="form-2" >
	  
	  <h2><span class="log-in">Sorry</span></h2>
	 
	 
	    <p class="float">
	      <label for="login"><i class="icon-user" class="form-control"></i>You don't Have&nbsp; </label>
        	
        </p>
	     
	   
	    <p class="float">
        	<label for="password"><i class="icon-lock"></i>Access To View This Panel</label>
        	
    	</p>
    	
    	<br><br><br>
    	<p class="clearfix"> 
            
       		 <a type="submit"   href="/"> Go Back</a>
    	</p> 
	 
	    
	  </div>
	  
	  

	</div>
	</div>
	

</body>
</html>
