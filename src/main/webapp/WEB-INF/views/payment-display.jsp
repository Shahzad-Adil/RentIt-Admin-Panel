<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
		<b>The Payments are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Bill</th>
			<th>Customer</th>
			<th>Trip</th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${payments}" var="pay">

			<tr>
				<td>${pay.id}</td>
				<td>${pay.bill}</td>
				<td>${pay.customer.name}</td>
				<td>${pay.trip.id}</td>
				
				
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>





<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>