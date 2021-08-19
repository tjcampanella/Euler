(ns e2.core)

(defn -main
  [& args]
  (println "Hello World"))

(defn fib [] 
  (loop [:n1 1 :n2 1]
    (recur ())))
