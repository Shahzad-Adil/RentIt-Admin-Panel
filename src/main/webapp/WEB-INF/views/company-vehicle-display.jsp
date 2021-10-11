<%@include file="common/header.jspf" %>
<%@include file="common/companyNavigation.jspf" %>


<body style="background-color: #E3E3E3">
<table class="table table-striped">
<caption>
		<b>Your Registered Vehicles are:</b>
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
			<th>At Terminal</th>
		
			
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
				
				<td>${veh.terminal.name}</td>
				
				</tr>
				
		
		</c:forEach>
				
		</tbody>
	</table>
	<a class="btn btn-success" href="/addVehicle">Add New Vehicle</a>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>