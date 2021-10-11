<%@include file="common/header.jspf" %>
<%@include file="common/companyNavigation.jspf" %>


<table class="table table-striped">
<caption>
	<b>The List of your Registered Contact Persons are:</b>
</caption>

	<thead>
		<tr>
			<th>Name</th>
			<th>CNIC</th>
			<th>Email Address</th>
			<th>PhoneNumber</th>
			<th>Company Name</th>
			<th>Description</th>
			<th></th>
			
			
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
				<td><a class="btn btn-success" href="/updateContactPerson?id=${cp.id}">Update</a>
				<a class="btn btn-danger" href="/deleteContactPerson?id=${cp.id}">Delete</a></td>
				
		
		</c:forEach>
				
		</tbody>
	</table>
		<div>
				  <a class="btn btn-success" href="/addContactPerson">  Add Contact Person  </a>
			</div>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>