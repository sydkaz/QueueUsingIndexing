The only thing that was bothering me with Queue data structure was , it reindex current elements after popping from queue which could be every expensive when there is hundres of thousands of records, so I thought why not give a try to an index based approach and create a circular list which will work in a similar way as queue, this is the exmple in which I have tried it.

Known Issues:
Like nothng is perfect in this world, so is this example in which I havent implemented validation for the capacity and havent handeled the situation where starts becomes highet then end.