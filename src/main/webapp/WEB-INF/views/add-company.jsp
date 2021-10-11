<%@include file="common/header.jspf" %>


<%@include file="common/footer.jspf" %>



<div class="container">
		<h1><b>Add a Company</b></h1>

		<form:form action="/addCompany" method="post" modelAttribute="company">
		
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input style="width:450px" path="name" type="text" class="form-control" placeholder="Enter Name of Company:" required="required"/>
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password</form:label>
				<form:input style="width:450px" path="password" type="text" class="form-control" required="required"
				placeholder="Enter Password:" minlength="6"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" class="form-control"
				placeholder="Enter Description:" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
