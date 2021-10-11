<%@include file="common/header.jspf" %>
	<%@include file="common/adminNavigation.jspf" %>

<h1>Welcome ${admin.fullName}</h1>

<div class="container"  align="right">
	<div class="container"  style="text-align:left">
	
		
<table class="table table-striped" style="margin:auto; width:50%">
<caption>
		<b>Your Profile Is:</b>
</caption>

	
		<tr>
			<td> Full Name</td>
			<td>${admin.fullName}</td>
		</tr>
		
		<tr>
			<td>CNIC</td>
			<td>${admin.cnic}</td>
		</tr>
		
		<tr>
			<td> Email Address</td>
			<td>${admin.email}</td>
		</tr>
		
		<tr>
			<td> Phone Number</td>
			<td>${admin.phone}</td>
		</tr>
		
		<tr>
			<td> Description </td>
			<td>${admin.description}</td>
		</tr>

	</table>
		
		
		
		
		
		
		
		<br>
			
			<fieldset class="form-group">
				<a  style="margin-left:285px; margin-top:5px;" class="btn btn-success" href="/updateAdminItself?id=${admin.id}">Update Profile</a>
			</fieldset>
		
	</div>
</div>

<br><br>



<div class="container1">
<table class="table table-striped" style="padding-right:10px">
<caption>
		<b>The Registered Admins are:</b>
</caption>

	<thead>
		<tr>
			<th>Name</th>
			<th>CNIC</th>
			<th>Email Address</th>
			<th>PhoneNumber</th>
			<th>UserName</th>
			<th>Description</th>	
			<th></th>
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${admins}" var="ad">

			<tr>
			
				<td> ${ad.fullName }</td>
				<td>${ad.cnic}</td>
				<td>${ad.email}</td>
				<td>${ad.phone}</td>
				<td>${ad.userName}</td>
				<td>${ad.description}</td>
				
				<td>
				<a class="btn btn-danger" href="/deleteAdmin?id=${ad.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>
	
	</div>
	
		<div>
				  <a class="btn btn-success" href="/addAdmin">  Add  </a>
			</div>

<br><br><br>




<%@include file="common/footer.jspf" %>