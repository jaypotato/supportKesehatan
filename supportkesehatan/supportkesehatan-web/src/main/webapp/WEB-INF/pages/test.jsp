<style type="text/css" title="currentStyle">
@import "../utils/dataTables/css/demo_table.css";
</style>
 
<script type="text/javascript" language="javascript" src="../utils/dataTables/js/jquery.js">
</script>
<script type="text/javascript" language="javascript" src="../utils/dataTables/js/jquery.dataTables.js">
</script>
<script type="text/javascript" charset="utf-8">
$('#table_id').dataTable({
    "bProcessing": true,
    "sAjaxSource": "/doajax.do"
});
 
</script>
 
<table id="table_id">
    <thead>
        <tr>
            <th>Rendering engine</th>
            <th>Browser</th>
            <th>Platform(s)</th>
            <th>Engine version</th>
            <th>CSS grade</th>
        </tr>
    </thead>
    <tbody>
    <tr>
        <td colspan="5" class="dataTables_empty">Loading data from server</td>
    </tr>
    </tbody>
    <tfoot>
        <tr>
        <th>Rendering engine</th>
        <th>Browser</th>
        <th>Platform(s)</th>
        <th>Engine version</th>
        <th>CSS grade</th>
    </tr>
    </tfoot>
</table>
