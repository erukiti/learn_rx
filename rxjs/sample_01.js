(function(window, undefined) {
    var clickStream = Rx.Observable.fromEvent(document, "mouseup");
    clickStream
        .buffer(clickStream.throttle(250))
        .map(function(x) {return x.length})
        .filter(function(n) {return n >= 2})
        .subscribe(function(n) {console.log(n + "click")});
}(window));