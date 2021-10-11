<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>


	<title>RentIt Application</title>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	 
	<style>
		
		::-webkit-scrollbar {
		  width: 20px;
		}
		
		/* Track */
		::-webkit-scrollbar-track {
		  box-shadow: inset 0 0 5px grey; 
		  border-radius: 10px;
		}
		 
		/* Handle */
		::-webkit-scrollbar-thumb {
		  background: #F0EBCC; 
		  border-radius: 10px;
		}
		
		/* Handle on hover */
		::-webkit-scrollbar-thumb:hover {
		  background: #3EDBF0; 
		}
		
		.container {
		  position: relative;
		}
		
		.top-center {
		  position: absolute;
		  top: 5%;
		  left: 40%;
		  color: #77ACF1;
		}
		
		.center-left {
		  position: absolute;
		  color:blue;
		  top: 25%;
		  left: 5%;
		 
		}
		
		.text
		{
			text-shadow: 1px 1px 2px black, 0 0 4em red, 0 0 0.5em blue;
		  color: white;
		  font: 1.5em Georgia, serif;
		}
		
        
		
		
		.top-center a:link, .top-center a:visited {
		  background-color: #77ACF1;
		  color: black;
		  border: 1px solid yellow;
		  padding: 10px 20px;
		  text-align: center;
		  text-decoration: none;
		  display: inline-block;
		}

		.top-center a:hover, .top-center a:active {
		  background-color: blue;
		  color: white;
		  transform: scale(1.2); 
		}
	
			
			.topnav {
			  background-color: #5f4c4c;
			  overflow: hidden;
			}
			
			/* Style the links inside the navigation bar */
			.topnav a {
			  float: left;
			  color: #f2f2f2;
			  text-align: center;
			  padding: 14px 16px;
			  text-decoration: none;
			  font-size: 17px;
			}
			
			/* Change the color of links on hover */
			.topnav a:hover {
			  background-color: #ddd;
			  color: black;
			}
			
			/* Add a color to the active/current link */
			.topnav a.active {
			  background-color: #04AA6D;
			  color: white;
			}
						
			
			
	</style>
</head>

<body style="background-color: #E3E3E3">



<div class="topnav">
  <a class="active" href="#">Home</a>
  <a href="/adminDisplay">Admin Login</a>
  <a href="/companyDisp">Company Login</a>
  
</div>


	


	<div class="container" style="margin: 0px; padding: 0px;  width: 100%; height: 100% ">
		<img alt="HomeImage" 
			src="https://images.unsplash.com/photo-1471174617910-3e9c04f58ff5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"
			style="width: 100%;  height: 100%; opacity: 0.9">
	
		
		<div class="center-left">
			<span class="text" style="font-size: 65px"><b>RentIt</b></span><br>
			<span class="text" style="font-size: 45px">A car rental service provider</span>
			
		</div>
		
	</div>	
	<br>
	
	
	

	
	<div style="text-align: center; border-bottom: 5px solid #3EDBF0;">
		<h1>Developers</h1>
		
		<table style="margin: auto;"> 
		   <tr> 
		      <td>
		      	<div  style="padding: 12px; padding-right: 40px" >
					<h2>Shahid Zafar</h2>
					<h3>Contact:</h3>
					
					<p>Ph : +923495466623</p>
					<p>shahid.bsse3515@gmail.com</p>
					 <p><a href="www.linkedin.com/in/shahidzafar2762">www.linkedin.com/in/shahidzafar2762</a></p>
				</div>
		      </td> 
		      	
		      	
		      <td>
		      	<div  style="padding: 10px">
		      
					<h2>Adil Shahzad</h2>
					<h3>Contact:</h3>
					<p>Ph : +923495466623</p>
					<p>shahid.bsse3515@gmail.com</p>
					<p><a href="www.linkedin.com/in/adilShahzad">www.linkedin.com/in/adilShahzad </a></p>
					
				</div>
		      </td> 
		      
		   </tr> 
	</table> 
	
	</div>
		 
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>



<%@include file="common/footer.jspf" %>
</body>
</html>

