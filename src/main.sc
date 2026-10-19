require: import.sc

theme: /

    state: Start
        q!: $regex</start>
        script:
            var id = getRandomInt(1, 2)

            var client = _.find(clients, function(c) {
                return c.id === id
            })

            var order = _.find(orders, function(o) {
                return o.clientId === id
            })

            $client.fullName = client.fullName
            $client.name = client.name
            $client.phone = client.phone

            $session.product = client.product