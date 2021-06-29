(ns starter.my-npm-lib
  (:require [goog.events]))

(defn ^:export funkyMonkey
  []
  (js/console.log "Funky like a monkey!")
  goog.events/EventType.CLICK)
