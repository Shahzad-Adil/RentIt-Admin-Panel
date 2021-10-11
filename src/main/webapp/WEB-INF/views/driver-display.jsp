<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>
<table class="table table-striped">
<caption>
		<b>The Registered Drivers are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>CNIC</th>
			<th>Email Address</th>
			<th>PhoneNumber</th>
			<th>Driver_On_Trip</th>
			<th>Description</th>
			<th></th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${drivers}" var="driver">

			<tr>
				<td> ${driver.id}</td>
				<td> ${driver.name}</td>
				<td>${driver.cnic}</td>
				<td>${driver.email}</td>
				<td>${driver.phone}</td>
				<td>${driver.driver_on_trip}</td>
				<td>${driver.description}</td>
				
				<td>
				<a class="btn btn-danger" href="/deleteDriver?id=${driver.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>
	
		

<br><br><br>





<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>