<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>


<table class="table table-striped">
<caption>
		<b>The Registered Companies are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th></th>
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${company}" var="comp">

			<tr>
			
				<td> ${comp.id }</td>
				<td> ${comp.name }</td>
				<td>${comp.description}</td>
				
				<td><a class="btn btn-success" href="/updateCompany?id=${comp.id}">Update</a>
				<a class="btn btn-danger" href="/deleteCompany?id=${comp.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>


			<div>
				  <a class="btn btn-success" href="/addCompany">  Add  </a>
			</div>

<br><br><br>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>