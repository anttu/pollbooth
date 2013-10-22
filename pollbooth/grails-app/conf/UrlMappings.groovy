
class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}



		//"/"(view:"/index")
        "/"(controller: "Poll" , action: "index" )
		"500"(view:'/errors/500')
        "404"(view:'/errors/404')
	}
}
