(ns io.vertx.clojure.composite-future)

(import io.vertx.core.CompositeFuture)
(import io.vertx.core.CompositeFuture)
(import io.vertx.core.Handler)
(import io.vertx.core.Future)

(defn otherwise
  ([composite-future mapper] (.otherwise composite-future mapper))
  ([composite-future value] (.otherwise composite-future value)))
(defn all
  ([f1 f2] (CompositeFuture/all f1 f2))
  ([f1 f2 f3] (CompositeFuture/all f1 f2 f3))
  ([f1 f2 f3 f4] (CompositeFuture/all f1 f2 f3 f4))
  ([f1 f2 f3 f4 f5] (CompositeFuture/all f1 f2 f3 f4 f5))
  ([f1 f2 f3 f4 f5 f6] (CompositeFuture/all f1 f2 f3 f4 f5 f6))
  ([futures] (CompositeFuture/all futures)))
(defn set-handler
  ([composite-future handler] (.setHandler composite-future handler)))
(defn recover
  ([composite-future mapper] (.recover composite-future mapper)))
(defn cause
  ([composite-future index] (.cause composite-future index)))
(defn failed
  ([composite-future index] (.failed composite-future index)))
(defn result-at
  ([composite-future index] (.resultAt composite-future index)))
(defn otherwise-empty
  ([composite-future ] (.otherwiseEmpty composite-future )))
(defn any
  ([f1 f2] (CompositeFuture/any f1 f2))
  ([f1 f2 f3] (CompositeFuture/any f1 f2 f3))
  ([f1 f2 f3 f4] (CompositeFuture/any f1 f2 f3 f4))
  ([f1 f2 f3 f4 f5] (CompositeFuture/any f1 f2 f3 f4 f5))
  ([f1 f2 f3 f4 f5 f6] (CompositeFuture/any f1 f2 f3 f4 f5 f6))
  ([futures] (CompositeFuture/any futures)))
(defn result
  ([composite-future ] (.result composite-future )))
(defn size
  ([composite-future ] (.size composite-future )))
(defn compose
  ([composite-future handler next] (.compose composite-future handler next))
  ([composite-future mapper] (.compose composite-future mapper)))
(defn try-complete
  ([composite-future result] (.tryComplete composite-future result))
  ([composite-future ] (.tryComplete composite-future )))
(defn completer
  ([composite-future ] (.completer composite-future )))
(defn join
  ([f1 f2] (CompositeFuture/join f1 f2))
  ([f1 f2 f3] (CompositeFuture/join f1 f2 f3))
  ([f1 f2 f3 f4] (CompositeFuture/join f1 f2 f3 f4))
  ([f1 f2 f3 f4 f5] (CompositeFuture/join f1 f2 f3 f4 f5))
  ([f1 f2 f3 f4 f5 f6] (CompositeFuture/join f1 f2 f3 f4 f5 f6))
  ([futures] (CompositeFuture/join futures)))
(defn complete
  ([composite-future result] (.complete composite-future result))
  ([composite-future ] (.complete composite-future )))
(defn map
  ([composite-future mapper] (.map composite-future mapper)))
(defn succeeded
  ([composite-future index] (.succeeded composite-future index)))
(defn is-complete
  ([composite-future index] (.isComplete composite-future index)))