<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<body style="background-color: #E3E3E3">

<table class="table table-striped">
<caption>
	<b>	The Registered Vehicles are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Registration Number</th>
			<th>Model Number</th>
			<th>Category</th>
			<th>Avalaibility Status</th>
			<th>Vehicle Make</th>
			<th>Description</th>
			<th>Company</th>
			<th>At Terminal</th>
			<th></th>
		
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${vehicles}" var="veh">

			<tr>
				<td> ${veh.id }</td>
				<td> ${veh.v_reg_no }</td>
				<td>${veh.modelNumber}</td>
				<td>${veh.category}</td>
				<td>${veh.status}</td>
				<td>${veh.v_make}</td>
				<td>${veh.v_description}</td>
				<td>${veh.company.name}</td>
				<td>${veh.terminal.name}</td>
				<td>
				<a class="btn btn-success" href="/updateVehicle?id=${veh.id}">Update Vehicle</a>
				<a class="btn btn-danger" href="/deleteVehicle?id=${veh.id}">Delete</a>
				</td>
				
				</tr>
				
		
		</c:forEach>
				
		</tbody>
	</table>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>