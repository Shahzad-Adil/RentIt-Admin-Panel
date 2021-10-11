<%@include file="common/header.jspf" %>




<div class="container">
		<h1><b>Add a New Terminal</b></h1>

		<form:form action="/addTerminal" method="post" modelAttribute="terminal">
		
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input style="width:450px" path="name" type="text" class="form-control" 
				placeholder="Enter Name of terminal:" required="required"/>
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="longitude">Longitude</form:label>
				<form:input style="width:450px" path="longitude" type="number" step="any" class="form-control" 
				placeholder="Enter Longitude of terminal:" required="required"/>
				<form:errors path="longitude" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="latitude">Latitude</form:label>
				<form:input style="width:450px" path="latitude" type="number" step="any" class="form-control" 
				placeholder="Enter Latitide of terminal:" required="required"/>
				<form:errors path="latitude" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" placeholder="Enter Description:" class="form-control" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
<%@include file="common/footer.jspf" %>