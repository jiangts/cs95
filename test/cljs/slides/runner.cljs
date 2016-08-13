(ns slides.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [slides.core-test]))

(doo-tests 'slides.core-test)
