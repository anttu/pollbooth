package pollbooth

import javax.servlet.http.Cookie

class PollController {

    def pollService

    def index() {

        def model =  [ : ]

        model.put "polls" ,  pollService.activePolls

        render( view: "/poll/listofpolls", model: model)

    }

    def createPoll()  {

        def USER_ID_COOKIE_NAME = "UID"

        def model = [ : ]

        Cookie c = request.cookies.find()
                { it.name.equals(USER_ID_COOKIE_NAME) } ?:
                new Cookie(USER_ID_COOKIE_NAME, session.id)

        c.maxAge = 31557600
        response.addCookie(c)


        pollService.createPoll(c.value)

        model.put "polls" ,  pollService.activePolls

        render( view: "/poll/listofpolls", model: model)

    }
}
