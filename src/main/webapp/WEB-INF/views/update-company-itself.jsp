<%@include file="common/header.jspf" %>


<div class="container">
		
		
		<h1>
		
		<b>Update Your Profile</b></h1>
	  

		<form:form action="/updateCompanyItself" method="post" modelAttribute="company"
		style="
		margin-top: 100px;
 		 margin-bottom: 100px;
  		margin-right: 150px;
  		margin-left: 80px;;">
		
			<form:hidden path="id"/>
			<form:hidden path="name"/>
			
			<fieldset class="form-group">
				<form:label path="password">Password</form:label>
				<form:input style="width:450px" path="password" width="40" type="password" minlength="6" 
				class="form-control" required="required"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" class="form-control" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
		
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>




<%@include file="common/footer.jspf" %>