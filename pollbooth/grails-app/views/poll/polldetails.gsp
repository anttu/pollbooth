<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>List of active polls</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
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
		<div id="page-body" role="main">
			<h1>Poll details</h1>

			<div id="controller-list" role="navigation">
				<h2>${poll?.description}</h2>


                <g:each var="o" in="${poll?.options}">
                    <li class="controller">${o.pollOption}</li>
                </g:each>


                <g:form name="modify" controller="poll" action="modify" >

                                    <br />Add an answer option:
                                   <input type="text" id="answer1" name="answer1" />
                                   <input type="hidden" id="id" name="id" value="${poll.id}" />
                                   <input type="submit" name="submit" value="lähetä"/>
                </g:form>

			</div>
		</div>

	</body>
</html>