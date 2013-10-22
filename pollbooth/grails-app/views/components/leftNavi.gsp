<div id="status" role="complementary">
			<h1>Recent polls</h1>
			<ul>
                <g:each var="c" in="${polls?.sort { it.description } }">
                     <li class="controller"><g:link controller="poll" action="details" id="${c.id}">${c.description}</g:link></li>
                </g:each>
			</ul>

			<h1>Friends polls</h1>
			<ul>

			</ul>
</div>