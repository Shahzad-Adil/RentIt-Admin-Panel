<%@include file="common/header.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
		<h1><b>End Trip</b></h1>
	  

		<form:form action="/updateTrip" method="post" modelAttribute="trip">
		
			<form:hidden path="id"/>
			<form:hidden path="trip_date"/>
			<form:hidden path="start_time"/>
			<form:hidden path="end_time"/>
			<form:hidden path="terminal.id"/>
			<form:hidden path="customer.id"/>
			<form:hidden path="vehicle.id"/>
			<form:hidden path="driver.id"/>
			<form:hidden path="optionDriver"/>
			<form:hidden path="status"/>
			<form:hidden path="reading_at_start"/>

			
			<fieldset class="form-group">
				<form:label path="description" style="color:red;">${trip.description}</form:label>
			</fieldset>
		
			
			<fieldset class="form-group">
				<form:label path="reading_at_end">Meter Reading at End Of Ride:</form:label>
				<form:input style="width:450px" path="reading_at_end"  type="number" step="any" class="form-control" required="required"/>
				<form:errors path="reading_at_end" cssClass="text-warning" />
			</fieldset>
		
		
			<button type="submit" class="btn btn-success">Submit</button>
			
		</form:form>
		
		
	</div>




<%@include file="common/footer.jspf" %>