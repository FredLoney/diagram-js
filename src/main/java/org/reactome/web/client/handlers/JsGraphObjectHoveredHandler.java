package org.reactome.web.client.handlers;

import org.reactome.web.client.model.DiagramObject;
import org.timepedia.exporter.client.ExportClosure;
import org.timepedia.exporter.client.Exportable;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
@ExportClosure
public interface JsGraphObjectHoveredHandler extends Exportable {
    void hovered(DiagramObject object);
}
