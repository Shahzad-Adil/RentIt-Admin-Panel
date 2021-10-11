<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
		<b>The Registered Contact Persons are:</b>
</caption>

	<thead>
		<tr>
			<th>Name</th>
			<th>CNIC</th>
			<th>Email Address</th>
			<th>PhoneNumber</th>
			<th>Company Name</th>
			<th>Description</th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${contactpersons}" var="cp">

			<tr>
			
				<td> ${cp.name }</td>
				<td>${cp.cnic}</td>
				<td>${cp.email}</td>
				<td>${cp.phone}</td>
				<td>${cp.company.name}</td>
				<td>${cp.description}</td>
				
		
		</c:forEach>
				
		</tbody>
	</table>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>