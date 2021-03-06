(ns io.vertx.clojure.core.timeout-stream)

(import io.vertx.core.Handler)
(import io.vertx.core.TimeoutStream)

(defn cancel
  ([timeout-stream ] (.cancel timeout-stream )))
(defn end-handler
  ([timeout-stream end-handler] (.endHandler timeout-stream end-handler)))
(defn exception-handler
  ([timeout-stream handler] (.exceptionHandler timeout-stream handler)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([timeout-stream handler] (.handler timeout-stream handler)))
(defn pause
  ([timeout-stream ] (.pause timeout-stream )))
(defn resume
  ([timeout-stream ] (.resume timeout-stream )))