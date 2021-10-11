<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<meta http-equiv="refresh" content="5"></meta>





	


<table class="table table-striped">
<caption style="padding : 20px "  style="font-size: 40px;">
		 The Pending Rides are:
</caption>


	<thead>
		<tr>
		
			<th>Trip Id</th>
			<th>Trip Date</th>
			<th>Starting Time</th>
			<th>Ending Time</th>
			<th>Meter Reding at Start</th>
			<th>Meter Reading at End</th>
			<th>Status</th>
			<th>Vehicle</th>
			<th>Customer</th>
			<th>Driver</th>
			<th>Description</th>
			<th></th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${trips}" var="trip">
		<c:if test="${trip.status=='pending' }">
		
			<tr>
				<td> ${trip.id }</td>
				<td> ${trip.trip_date }</td>
				<td>${trip.start_time}</td>
				<td>${trip.end_time}</td>
				<td>${trip.reading_at_start}</td>
				<td>${trip.reading_at_end}</td>
				<td>${trip.status}</td>
				<td>${trip.vehicle.v_reg_no}</td>
				<td>${trip.customer.id}</td>
				<td>${trip.driver.id}</td>
				<td>${trip.description}</td>
				<td>
					<a class="btn btn-info" href="/acceptTrip?id=${trip.id}">Accept</a>
				</td>
				
			</tr>
			</c:if>
		
		</c:forEach>
				
		</tbody>
	</table>
	

<br><br><br><br>
	

<br><br><br><br>



<table class="table table-striped">
<caption>
		The Active or Current Rides are:
</caption>

	<thead>
		<tr>
			<th>Trip Id</th>
			<th>Trip Date</th>
			<th>Starting Time</th>
			<th>Ending Time</th>
			<th>Meter Reading at Start</th>
			<th>Meter Reading at End</th>
			<th>Status</th>
			<th>Vehicle</th>
			<th>Customer</th>
			<th>Driver</th>
			<th>Description</th>
			<th></th>
			
		</tr>
	</thead>
	
	
	<tbody>
		<c:forEach items="${trips}" var="trip">
		<c:if test="${trip.status=='current' }">
		
			<tr>
				<td> ${trip.id }</td>
				<td> ${trip.trip_date }</td>
				<td>${trip.start_time}</td>
				<td>${trip.end_time}</td>
				<td>${trip.reading_at_start}</td>
				<td>${trip.reading_at_end}</td>
				<td>${trip.status}</td>
				<td>${trip.vehicle.v_reg_no}</td>
				<td>${trip.customer.id}</td>
				<td>${trip.driver.id}</td>
				<td>${trip.description}</td>
				<td>
				<a class="btn btn-success" href="/updateTrip?id=${trip.id}">End</a></td>
			</tr>
			
			</c:if>
		
		</c:forEach>
				
		</tbody>
	</table>
	

	<br><br><br><br>
	

		<br><br><br><br>
<table class="table table-striped">
<caption>
		The Accepted Trips are:
</caption>

	<thead>
		<tr>
		
			<th>Trip Id</th>
			<th>Trip Date</th>
			<th>Starting Time</th>
			<th>Ending Time</th>
			<th>Meter Reding at Start</th>
			<th>Meter Reading at End</th>
			<th>Status</th>
			<th>Vehicle</th>
			<th>Customer</th>
			<th>Driver</th>
			<th>Description</th>
			<th></th>
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${trips}" var="trip">
		<c:if test="${trip.status=='accepted' }">
		
			<tr>
				<td> ${trip.id }</td>
				<td> ${trip.trip_date }</td>
				<td>${trip.start_time}</td>
				<td>${trip.end_time}</td>
				<td>${trip.reading_at_start}</td>
				<td>${trip.reading_at_end}</td>
				<td>${trip.status}</td>
				<td>${trip.vehicle.v_reg_no}</td>
				<td>${trip.customer.id}</td>
				<td>${trip.driver.id}</td>
				<td>${trip.description}</td>
				<td>	
				
				
				<a class="btn btn-success" href="/startTrip?id=${trip.id}">Start</a> 	
				</td>
			</tr>
		</c:if>
		</c:forEach>
				
		</tbody>
	</table>
	
	
	<br><br><br><br>
	

		<br><br><br><br>
	
	<table class="table table-striped">
<caption>
		The Cancelled Trips are:
</caption>

	<thead>
		<tr>
		
			<th>Trip Id</th>
			<th>Trip Date</th>
			<th>Starting Time</th>
			<th>Ending Time</th>
			<th>Meter Reading at Start</th>
			<th>Meter Reading at End</th>
			<th>Status</th>
			<th>Vehicle</th>
			<th>Customer</th>
			<th>Driver</th>
			<th>Description</th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${trips}" var="trip">
		<c:if test="${trip.status=='cancelled' }">
		
			<tr>
				<td> ${trip.id }</td>
				<td> ${trip.trip_date }</td>
				<td>${trip.start_time}</td>
				<td>${trip.end_time}</td>
				<td>${trip.reading_at_start}</td>
				<td>${trip.reading_at_end}</td>
				<td>${trip.status}</td>
				<td>${trip.vehicle.v_reg_no}</td>
				<td>${trip.customer.id}</td>
				<td>${trip.driver.id}</td>
				<td>${trip.description}</td>
				
			</tr>
		</c:if>
		</c:forEach>
				
		</tbody>
	</table>
	
	<br><br><br><br>
	

		<br><br><br><br>
		
<table class="table table-striped">
<caption>
		The Completed Trips are:
</caption>

	<thead>
		<tr>
		
			<th>Trip Id</th>
			<th>Trip Date</th>
			<th>Starting Time</th>
			<th>Ending Time</th>
			<th>Meter Reading at Start</th>
			<th>Meter Reading at End</th>
			<th>Status</th>
			<th>Vehicle</th>
			<th>Customer</th>
			<th>Driver</th>
			<th>Description</th>
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${trips}" var="trip">
		<c:if test="${trip.status=='completed' }">
		
			<tr>
				<td> ${trip.id }</td>
				<td> ${trip.trip_date }</td>
				<td>${trip.start_time}</td>
				<td>${trip.end_time}</td>
				<td>${trip.reading_at_start}</td>
				<td>${trip.reading_at_end}</td>
				<td>${trip.status}</td>
				<td>${trip.vehicle.v_reg_no}</td>
				<td>${trip.customer.id}</td>
				<td>${trip.driver.id}</td>
				<td>${trip.description}</td>
				
			</tr>
		</c:if>
		</c:forEach>
				
		</tbody>
	</table>
	
	<br><br><br><br>
	

		<br><br><br><br>
	
	
	





<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>