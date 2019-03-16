Example of Neo4j Integrating With A Skeleton Spring Web Servlet Project.


## Data Model

    
    ╒══════════════════════════════════════════════╕                                          │
    ╞══════════════════════════════════════════════╡
    │{"jobTitle":"Software Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Delivery Driver"}                │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Robotics Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Software Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Delivery Driver"}                │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Robotics Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Software Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Delivery Driver"}                │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Robotics Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Software Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Delivery Driver"}                │
    ├──────────────────────────────────────────────┤
    │{"jobTitle":"Robotics Engineer"}              │
    ├──────────────────────────────────────────────┤
    │{"name":"Nick","jobTitle":"Software Engineer"}│
    ├──────────────────────────────────────────────┤
    │{"name":"Chris","jobTitle":"Delivery Driver"} │
    ├──────────────────────────────────────────────┤
    │{"name":"John","jobTitle":"Robotics Engineer"}│
    ├──────────────────────────────────────────────┤
    │{"name":"Nick","jobTitle":"Software Engineer"}│
    ├──────────────────────────────────────────────┤
    │{"name":"Chris","jobTitle":"Delivery Driver"} │
    ├──────────────────────────────────────────────┤
    │{"name":"John","jobTitle":"Robotics Engineer"}│
    ├──────────────────────────────────────────────┤
    │{"name":"Nick","jobTitle":"Software Engineer"}│
    ├──────────────────────────────────────────────┤
    │{"name":"Chris","jobTitle":"Delivery Driver"} │
    ├──────────────────────────────────────────────┤
    │{"name":"John","jobTitle":"Robotics Engineer"}│
    └──────────────────────────────────────────────┘
##

Relationships are defined by jobTitle and pattern matching. So in this example Im a Software Engineer with friends that work as a Delivery Driver and a Robotics Engineer. A Cipher query is declared which essentially does a regex operation on the jobTitle String, see's Engineer in 2 of the 3 Nodes and creates that relationship.

![Math Is Cool](https://i.imgur.com/yJirtXZl.png)