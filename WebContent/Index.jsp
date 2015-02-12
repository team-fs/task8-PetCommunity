<jsp:include page="template-top.jsp" />


<div class="container">
<div class="row clearfix">
		<div class="col-md-6 column">
			<form class="form-horizontal" role="form">
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-3 control-label">Username</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="inputEmail3" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
					<div class="col-sm-8">
						<input type="password" class="form-control" id="inputPassword3" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button type="submit" class="btn btn-default">Sign in</button>
						 <button type="submit" class="btn btn-default">Sign Up</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-6 column">
		
		 <button type="submit" class="btn btn-info btn-block btn-lg"><a href="signin">Connect with Twitter!</a></button> <button type="button" class="btn btn-info btn-block btn-lg"><a href="signinF">Connect with Flickr!</a></button>
		</div>
	</div>
	</div>


			
<jsp:include page="template-bottom.jsp" />