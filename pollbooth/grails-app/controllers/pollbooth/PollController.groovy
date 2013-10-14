package pollbooth

import javax.servlet.http.Cookie

class PollController {

    String USER_ID_COOKIE_NAME = "UID"

    def pollService

    def index() {

        def model =  [ : ]

        model.put "polls" ,  pollService.activePolls

        render( view: "/poll/listofpolls", model: model)

    }

    def details() {

        def model =  [ : ]

        model.put "poll" ,  pollService.getPoll(params?.id)
        model.put "polls" ,  pollService.activePolls

        render( view: "/poll/polldetails", model: model)

    }

    def createPoll()  {


        def model = [ : ]

        log.debug(USER_ID_COOKIE_NAME)

        Cookie c = request.cookies.find()
                { it.name.equals(USER_ID_COOKIE_NAME) } ?:
                new Cookie(USER_ID_COOKIE_NAME, session.id)

        c.maxAge = 31557600
        response.addCookie(c)


        pollService.createPoll(c.value, params?.description)

        model.put "polls" ,  pollService.activePolls

        render( view: "/poll/listofpolls", model: model)

    }
}
