(ns io.vertx.clojure.core.streams.read-stream)

(import io.vertx.core.Handler)
(import io.vertx.core.streams.ReadStream)

(defn end-handler
  ([read-stream end-handler] (.endHandler read-stream end-handler)))
(defn exception-handler
  ([read-stream handler] (.exceptionHandler read-stream handler)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([read-stream handler] (.handler read-stream handler)))
(defn pause
  ([read-stream ] (.pause read-stream )))
(defn resume
  ([read-stream ] (.resume read-stream )))