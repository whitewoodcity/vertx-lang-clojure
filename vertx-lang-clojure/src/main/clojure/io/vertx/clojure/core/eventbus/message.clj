(ns io.vertx.clojure.core.eventbus.message)

(import io.vertx.core.Handler)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.eventbus.Message)

(defn address
  ([message ] (.address message )))
(defn body
  ([message ] (.body message )))
(defn fail
  ([message failure-code message] (.fail message failure-code message)))
(defn headers
  ([message ] (.headers message )))
(defn is-send
  ([message ] (.isSend message )))
(defn reply
  ([message message] (.reply message message))
  ([message message options-or-reply-handler] (.reply message message options-or-reply-handler))
  ([message message options reply-handler] (.reply message message options reply-handler)))
(defn reply-address
  ([message ] (.replyAddress message )))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))