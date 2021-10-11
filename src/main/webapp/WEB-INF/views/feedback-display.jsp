<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
		<b>The Registered Feedbacks are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Rating</th>
			<th>Customer</th>
			<th>Vehicle</th>
			<th>Comment</th>
		
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${feedbacks}" var="feedback">

			<tr>
				<td> ${feedback.id }</td>
				<td> ${feedback.rating }</td>
				<td>${feedback.customer.name}</td>
				<td>${feedback.vehicle.v_reg_no}</td>
				<td>${feedback.description}</td>
		
				</tr>
				
		
		</c:forEach>
				
		</tbody>
	</table>


<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>