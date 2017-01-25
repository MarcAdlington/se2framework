package uk.ac.uea.framework;

/*
*   Marc Adlington
 */

public abstract class FrameworkCopyright {

        private String CopyrightText;
        protected abstract String getAppCopyright();

        protected FrameworkCopyright() {
            CopyrightText = "Location Finder Application. (c) University of East Anglia 2016.";
        }

        public final String getCopyright() {
            return CopyrightText + "\n\n" + getAppCopyright();
        }

}
