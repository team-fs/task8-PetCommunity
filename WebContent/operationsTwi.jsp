<jsp:include page="template-top.jsp" />

<small> <p align="right"> <font color="blue"> <a href="./logout">Welcome ${twitter.screenName } (${twitter.id })</a></font></p></small>

<div class="row clearfix">
		<div class="col-md-12 column">
		<p>
		
		</p>
			<form class="form-horizontal" role="form" action="./post" method="POST">
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">Tweet to Post:</label>
					<div class="col-sm-10">
						<input type="text" name="text" class="form-control" id="inputEmail3" />
						 <br />
						<input type="file" name="fileName" /> 
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button type="submit" value="update" class="btn btn-default">Post</button>
					</div>
				</div>
			</form>
		</div>
	</div>
			
<jsp:include page="template-bottom.jsp" />