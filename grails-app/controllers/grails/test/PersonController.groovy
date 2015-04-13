package grails.test

class PersonController {
    static allowedMethods = [create:'POST']

    def show() {
        def chrisCerami
        if (params.name && params.age)
            chrisCerami = new Person(name: params.name, age: params.age, lastVisit: new Date())
        else
            chrisCerami = new Person(name: "Chris Cerami", age: 26, lastVisit: new Date())
        [person: chrisCerami]
    }

    def index() {
        def people = Person.getAll()
        [people: people]
    }

    def newPerson() {
        def person = new Person()
        [person: person]
    }

    def create() {
        def person = new Person(name: params.name,
                age: Integer.parseInt(params.age),
                lastVisit: new Date())
        redirect(action: "show", params: [name: person.name, age: person.age])
    }
}
