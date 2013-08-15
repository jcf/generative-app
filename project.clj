(defproject generative-app "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :repl-options {:init (use 'dev)}
  :dependencies [[org.clojure/test.generative "0.4.0"]
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1586"]
                 [domina "1.0.1"]
                 [ch.qos.logback/logback-classic "1.0.7"
                  :exclusions [org.slf4j/slf4j-api]]
                 [io.pedestal/pedestal.app "0.1.10"]
                 [io.pedestal/pedestal.app-tools "0.1.10"]]
  :profiles {:dev {:source-paths ["dev"]}}
  :min-lein-version "2.0.0"
  :source-paths ["app/src" "app/templates"]
  :resource-paths ["config"]
  :target-path "out/"
  :aliases {"dumbrepl" ["trampoline" "run" "-m" "clojure.main/main"]})
