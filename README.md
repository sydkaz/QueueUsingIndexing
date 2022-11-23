The only thing that was bothering me with Queue data structure was, it reindex current elements after popping from the queue which could be very expensive when there are hundreds of thousands of records, so I thought why not give it a try to an index-based approach and create a circular list which will work similarly as a queue, this is the example in which I have tried it.

Known Issues:
Like nothing is perfect in this world, so is this example in which I haven't implemented validation for the capacity and haven't handled the situation where the start becomes greater then end.
