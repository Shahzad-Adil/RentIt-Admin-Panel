<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
		<b>The Registered Terminals are:</b>
</caption>

	<thead>
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Longitude</th>
			<th>Latitude</th>
			<th></th>
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${terminals}" var="ter">

			<tr>
			
				<td> ${ter.id }</td>
				<td> ${ter.name }</td>
				<td>${ter.description}</td>
				<td>${ter.longitude}</td>
				<td>${ter.latitude}</td>
				
				<td><a class="btn btn-success" href="/updateTerminal?id=${ter.id}">Update</a>
				<a class="btn btn-danger" href="/deleteTerminal?id=${ter.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>


			<div>
				  <a class="btn btn-success" href="/addTerminal">  Add New Terminal </a>
			</div>

<br><br><br>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>